package com.geekbrains.tests.presenter.details

import com.geekbrains.tests.view.details.ViewDetailsContract

internal class DetailsPresenter internal constructor(
    private var viewContract: ViewDetailsContract?,
    var count: Int = 0
) : PresenterDetailsContract {

    override fun setCounter(count: Int) {
        this.count = count
    }

    override fun onIncrement() {
        count++
        viewContract?.setCount(count)
    }

    override fun onDecrement() {
        count--
        viewContract?.setCount(count)
    }

    override fun onAttach(view: ViewDetailsContract) {
        super.onAttach(view)
        viewContract = view
    }

    override fun onDetach() {
        super.onDetach()
        viewContract = null
    }
}
