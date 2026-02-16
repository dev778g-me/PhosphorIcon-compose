package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ScalesFill: ImageVector
    get() {
        if (_ScalesFill != null) {
            return _ScalesFill!!
        }
        _ScalesFill = ImageVector.Builder(
            name = "Filled.ScalesFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(239.43f, 133f)
                lineToRelative(-32f, -80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 48f)
                arcToRelative(8.27f, 8.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.73f, 0.21f)
                lineTo(136f, 62f)
                lineTo(136f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                lineTo(120f, 65.58f)
                lineTo(54.27f, 80.21f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48.57f, 85f)
                lineToRelative(-32f, 80f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.57f, 3f)
                curveToRelative(0f, 23.31f, 24.54f, 32f, 40f, 32f)
                reflectiveCurveToRelative(40f, -8.69f, 40f, -32f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.57f, -3f)
                lineTo(66.92f, 93.77f)
                lineTo(120f, 82f)
                lineTo(120f, 208f)
                lineTo(104f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(136f, 208f)
                lineTo(136f, 78.42f)
                lineTo(187f, 67.1f)
                lineTo(160.57f, 133f)
                arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.57f, 3f)
                curveToRelative(0f, 23.31f, 24.54f, 32f, 40f, 32f)
                reflectiveCurveToRelative(40f, -8.69f, 40f, -32f)
                arcTo(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 239.43f, 133f)
                close()
                moveTo(79.43f, 168f)
                lineTo(32.62f, 168f)
                lineTo(56f, 109.54f)
                close()
                moveTo(176.67f, 136f)
                lineTo(200f, 77.54f)
                lineTo(223.38f, 136f)
                close()
            }
        }.build()

        return _ScalesFill!!
    }

@Suppress("ObjectPropertyName")
private var _ScalesFill: ImageVector? = null
