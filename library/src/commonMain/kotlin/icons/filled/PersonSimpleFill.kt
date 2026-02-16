package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PersonSimpleFill: ImageVector
    get() {
        if (_PersonSimpleFill != null) {
            return _PersonSimpleFill!!
        }
        _PersonSimpleFill = ImageVector.Builder(
            name = "Filled.PersonSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(95.89f, 48f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 95.89f, 48f)
                close()
                moveTo(228.12f, 121.14f)
                curveTo(226.4f, 120.11f, 185.55f, 96f, 128f, 96f)
                reflectiveCurveTo(29.6f, 120.11f, 27.88f, 121.14f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.24f, 13.72f)
                curveToRelative(0.36f, -0.22f, 34.91f, -20.6f, 83.88f, -22.68f)
                lineTo(120f, 149f)
                lineTo(58f, 218.69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 10.62f)
                lineTo(128f, 164f)
                lineToRelative(58f, 65.27f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -10.62f)
                lineTo(136f, 149f)
                lineTo(136f, 112.19f)
                curveToRelative(48.77f, 2.08f, 83.53f, 22.46f, 83.88f, 22.67f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8.24f, -13.72f)
                close()
            }
        }.build()

        return _PersonSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _PersonSimpleFill: ImageVector? = null
