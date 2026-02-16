package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HandshakeFill: ImageVector
    get() {
        if (_HandshakeFill != null) {
            return _HandshakeFill!!
        }
        _HandshakeFill = ImageVector.Builder(
            name = "Filled.HandshakeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(254.3f, 107.91f)
                lineTo(228.78f, 56.85f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -21.47f, -7.15f)
                lineTo(182.44f, 62.13f)
                lineTo(130.05f, 48.27f)
                arcToRelative(8.14f, 8.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.1f, 0f)
                lineTo(73.56f, 62.13f)
                lineTo(48.69f, 49.7f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -21.47f, 7.15f)
                lineTo(1.7f, 107.9f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.15f, 21.47f)
                lineToRelative(27f, 13.51f)
                lineToRelative(55.49f, 39.63f)
                arcToRelative(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.71f, 1.25f)
                lineToRelative(64f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.6f, -2.1f)
                lineToRelative(40f, -40f)
                lineToRelative(15.08f, -15.08f)
                lineToRelative(26.42f, -13.21f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.15f, -21.46f)
                close()
                moveTo(199.41f, 141.28f)
                lineTo(165f, 113.72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.68f, 0.61f)
                curveTo(136.51f, 132.27f, 116.66f, 130f, 104f, 122f)
                lineTo(147.24f, 80f)
                horizontalLineToRelative(31.81f)
                lineToRelative(27.21f, 54.41f)
                close()
                moveTo(157.54f, 183.14f)
                lineTo(99.42f, 168.61f)
                lineToRelative(-49.2f, -35.14f)
                lineToRelative(28f, -56f)
                lineTo(128f, 64.28f)
                lineToRelative(9.8f, 2.59f)
                lineToRelative(-45f, 43.68f)
                lineToRelative(-0.08f, 0.09f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.72f, 24.81f)
                curveToRelative(20.56f, 13.13f, 45.37f, 11f, 64.91f, -5f)
                lineTo(188f, 152.66f)
                close()
                moveTo(131.82f, 217.94f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.75f, 6.06f)
                arcToRelative(8.13f, 8.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.95f, -0.24f)
                lineTo(80.41f, 213.33f)
                arcToRelative(7.89f, 7.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.71f, -1.25f)
                lineTo(51.35f, 193.26f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.3f, -13f)
                lineToRelative(25.11f, 17.94f)
                lineTo(126f, 208.24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 131.82f, 217.94f)
                close()
            }
        }.build()

        return _HandshakeFill!!
    }

@Suppress("ObjectPropertyName")
private var _HandshakeFill: ImageVector? = null
