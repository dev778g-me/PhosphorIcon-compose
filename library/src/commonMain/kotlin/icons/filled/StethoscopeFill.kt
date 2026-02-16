package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.StethoscopeFill: ImageVector
    get() {
        if (_StethoscopeFill != null) {
            return _StethoscopeFill!!
        }
        _StethoscopeFill = ImageVector.Builder(
            name = "Filled.StethoscopeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(240f, 160f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, -39.93f, 31f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.07f, 1f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 32f)
                lineTo(144f, 224f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, -32f)
                lineTo(112f, 151.48f)
                curveToRelative(31.47f, -4f, 56f, -31.47f, 56f, -64.31f)
                lineTo(168f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                lineTo(136f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(16f)
                lineTo(152f, 87.17f)
                curveToRelative(0f, 26.58f, -21.25f, 48.49f, -47.36f, 48.83f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 88f)
                lineTo(56f, 48f)
                lineTo(72f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(48f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                lineTo(40f, 88f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 63.49f)
                lineTo(96f, 192f)
                arcToRelative(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 48f)
                horizontalLineToRelative(24f)
                arcToRelative(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, -48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.07f, -1f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 240f, 160f)
                close()
                moveTo(208f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, -8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 168f)
                close()
            }
        }.build()

        return _StethoscopeFill!!
    }

@Suppress("ObjectPropertyName")
private var _StethoscopeFill: ImageVector? = null
