package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ButterflyFill: ImageVector
    get() {
        if (_ButterflyFill != null) {
            return _ButterflyFill!!
        }
        _ButterflyFill = ImageVector.Builder(
            name = "Filled.ButterflyFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 100.17f)
                arcToRelative(108.42f, 108.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -12.64f)
                verticalLineTo(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineTo(87.53f)
                arcTo(108.42f, 108.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 100.17f)
                close()
                moveTo(232.7f, 50.48f)
                curveTo(229f, 45.7f, 221.84f, 40f, 209f, 40f)
                curveToRelative(-16.85f, 0f, -38.46f, 11.28f, -57.81f, 30.16f)
                arcTo(140.07f, 140.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 87.53f)
                verticalLineTo(180f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(87.53f)
                arcToRelative(140.07f, 140.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.15f, -17.37f)
                curveTo(85.49f, 51.28f, 63.88f, 40f, 47f, 40f)
                curveTo(34.16f, 40f, 27f, 45.7f, 23.3f, 50.48f)
                curveToRelative(-6.82f, 8.77f, -12.18f, 24.08f, -0.21f, 71.2f)
                curveToRelative(6.05f, 23.83f, 19.51f, 33f, 30.63f, 36.42f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 205.27f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 74.28f, -47.17f)
                curveToRelative(11.12f, -3.4f, 24.57f, -12.59f, 30.63f, -36.42f)
                curveTo(239.63f, 95.24f, 244.85f, 66.1f, 232.7f, 50.48f)
                close()
            }
        }.build()

        return _ButterflyFill!!
    }

@Suppress("ObjectPropertyName")
private var _ButterflyFill: ImageVector? = null
