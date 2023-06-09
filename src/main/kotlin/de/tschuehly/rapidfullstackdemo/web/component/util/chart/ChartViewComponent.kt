package de.tschuehly.rapidfullstackdemo.web.component.util.chart

import de.tschuehly.spring.viewcomponent.core.ViewComponent
import de.tschuehly.spring.viewcomponent.thymeleaf.ViewContext
import de.tschuehly.spring.viewcomponent.core.toProperty

@ViewComponent
class ChartViewComponent {
    fun render(
        barchartDetails: ChartDetails
    ) = ViewContext("barchartDetails" toProperty barchartDetails)

    class ChartDetails(
        val type: String,
        val width: Number,
        val height: Number,
        val chartLabel: String,
        val labels: List<String>,
        val data: List<Number>
    )
}