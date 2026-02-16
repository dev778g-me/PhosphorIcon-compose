package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.GlobeSimpleFill: ImageVector
    get() {
        if (_GlobeSimpleFill != null) {
            return _GlobeSimpleFill!!
        }
        _GlobeSimpleFill = ImageVector.Builder(
            name = "Filled.GlobeSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                horizontalLineToRelative(0f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.12f, 104.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(215.62f, 120f)
                lineTo(175.79f, 120f)
                curveTo(174f, 83.49f, 159.94f, 57.67f, 148.41f, 42.4f)
                arcTo(88.19f, 88.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 215.63f, 120f)
                close()
                moveTo(96.23f, 136f)
                horizontalLineToRelative(63.54f)
                curveToRelative(-2.31f, 41.61f, -22.23f, 67.11f, -31.77f, 77f)
                curveTo(118.45f, 203.1f, 98.54f, 177.6f, 96.23f, 136f)
                close()
                moveTo(96.23f, 120f)
                curveTo(98.54f, 78.39f, 118.46f, 52.89f, 128f, 43f)
                curveToRelative(9.55f, 9.93f, 29.46f, 35.43f, 31.77f, 77f)
                close()
                moveTo(148.41f, 213.6f)
                curveToRelative(11.53f, -15.27f, 25.56f, -41.09f, 27.38f, -77.6f)
                horizontalLineToRelative(39.84f)
                arcTo(88.19f, 88.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 148.41f, 213.6f)
                close()
            }
        }.build()

        return _GlobeSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeSimpleFill: ImageVector? = null
