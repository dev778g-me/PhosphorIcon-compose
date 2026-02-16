package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.AirplaneInFlightFill: ImageVector
    get() {
        if (_AirplaneInFlightFill != null) {
            return _AirplaneInFlightFill!!
        }
        _AirplaneInFlightFill = ImageVector.Builder(
            name = "Filled.AirplaneInFlightFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -16f)
                horizontalLineTo(216f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 216f)
                close()
                moveTo(208f, 96f)
                horizontalLineTo(147.32f)
                lineTo(101.66f, 50.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 48f)
                horizontalLineTo(88f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72.83f, 69.06f)
                lineToRelative(9f, 26.94f)
                horizontalLineTo(59.32f)
                lineTo(37.66f, 74.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 72f)
                horizontalLineTo(24f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.69f, 92.6f)
                lineToRelative(14.07f, 46.89f)
                arcTo(39.75f, 39.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 61.07f, 168f)
                horizontalLineTo(240f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(136f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 96f)
                close()
            }
        }.build()

        return _AirplaneInFlightFill!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneInFlightFill: ImageVector? = null
