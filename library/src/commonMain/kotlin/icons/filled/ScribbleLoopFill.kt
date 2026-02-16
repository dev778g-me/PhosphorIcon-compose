package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ScribbleLoopFill: ImageVector
    get() {
        if (_ScribbleLoopFill != null) {
            return _ScribbleLoopFill!!
        }
        _ScribbleLoopFill = ImageVector.Builder(
            name = "Filled.ScribbleLoopFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 128f)
                arcToRelative(81.4f, 81.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 25.69f, 4.28f)
                curveTo(151.56f, 154.87f, 137.33f, 176f, 112f, 176f)
                curveToRelative(-15.8f, 0f, -24.06f, -10.85f, -24.06f, -21.58f)
                curveToRelative(0f, -6.59f, 3f, -12.75f, 8.56f, -17.35f)
                curveTo(103.62f, 131.14f, 114.52f, 128f, 128f, 128f)
                close()
                moveTo(224f, 48f)
                lineTo(224f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(48f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(32f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 32f)
                lineTo(208f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 48f)
                close()
                moveTo(205.89f, 146.59f)
                arcToRelative(120.21f, 120.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, -36.08f, -25.21f)
                curveToRelative(-0.9f, -14.35f, -5.75f, -27.54f, -13.89f, -37.55f)
                curveTo(145.38f, 70.86f, 130.19f, 64f, 112f, 64f)
                curveTo(76.44f, 64f, 50.68f, 97.76f, 49.6f, 99.2f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.79f, 9.62f)
                curveTo(62.61f, 108.53f, 84.51f, 80f, 112f, 80f)
                curveToRelative(13.4f, 0f, 24f, 4.68f, 31.5f, 13.92f)
                arcToRelative(47.54f, 47.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.48f, 21.4f)
                arcTo(96.75f, 96.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 112f)
                curveToRelative(-17.27f, 0f, -31.71f, 4.42f, -41.74f, 12.78f)
                curveTo(77f, 132.47f, 71.94f, 143f, 71.94f, 154.42f)
                curveTo(71.94f, 172.64f, 86f, 192f, 112f, 192f)
                arcToRelative(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 43.53f, -21.23f)
                arcTo(70f, 70f, 0f, isMoreThanHalf = false, isPositiveArc = false, 169f, 138.89f)
                arcToRelative(106.24f, 106.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 25.13f, 18.52f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.78f, -10.82f)
                close()
            }
        }.build()

        return _ScribbleLoopFill!!
    }

@Suppress("ObjectPropertyName")
private var _ScribbleLoopFill: ImageVector? = null
