package com.geekbrains.tests

import android.os.Build
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.geekbrains.tests.presenter.details.DetailsPresenter
import com.geekbrains.tests.view.details.ViewDetailsContract
import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.times
import com.nhaarman.mockito_kotlin.verify
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
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
        verify(view, times(1)).setCount(1)
    }
    @Test
    fun presenter_onDecrement(){
        presenter.onDecrement()

    }
    @Test
    fun presenter_setCounter(){
        presenter.setCounter(5)

    }
    @Test
    fun presenter_onAttach(){
        presenter.onAttach(view)

    }
    @Test
    fun presenter_onDetach(){
        presenter.onDetach()

    }
}
class ViewTest : ViewDetailsContract{
    var count : Int ?= 0
    override fun setCount(count: Int) {
        this.count = count
    }

}