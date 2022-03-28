package com.geekbrains.tests

import android.os.Build
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.geekbrains.tests.presenter.details.DetailsPresenter
import com.geekbrains.tests.view.details.ViewDetailsContract
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test



class DetailsPresenterTest {

    private lateinit var presenter: DetailsPresenter

    private lateinit var view : ViewTest

    @Before
    fun init(){
        view =ViewTest()

        presenter = DetailsPresenter(view)
    }
    @Test
    fun presenter_onIncrement(){
        presenter.onIncrement()
        assertEquals(1,view.count)
    }
    @Test
    fun presenter_onDecrement(){
        presenter.onDecrement()
        assertEquals(-1,view.count)
    }
    @Test
    fun presenter_setCounter(){
        presenter.setCounter(5)
        assertEquals(5,presenter.count)
    }
}
class ViewTest : ViewDetailsContract{
    var count : Int ?= 0
    override fun setCount(count: Int) {
        this.count = count
    }

}