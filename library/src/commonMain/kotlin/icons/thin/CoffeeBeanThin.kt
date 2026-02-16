package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.CoffeeBeanThin: ImageVector
    get() {
        if (_CoffeeBeanThin != null) {
            return _CoffeeBeanThin!!
        }
        _CoffeeBeanThin = ImageVector.Builder(
            name = "Thin.CoffeeBeanThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(49.89f, 206.11f)
                arcToRelative(78.91f, 110.47f, 45f, isMoreThanHalf = true, isPositiveArc = false, 156.23f, -156.23f)
                arcToRelative(78.91f, 110.47f, 45f, isMoreThanHalf = true, isPositiveArc = false, -156.23f, 156.23f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(206.11f, 49.89f)
                curveToRelative(-24.51f, 5f, -66.9f, 22f, -78.11f, 78.11f)
                reflectiveCurveToRelative(-53.6f, 73.09f, -78.11f, 78.11f)
            }
        }.build()

        return _CoffeeBeanThin!!
    }

@Suppress("ObjectPropertyName")
private var _CoffeeBeanThin: ImageVector? = null
