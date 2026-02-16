package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.TextBFill: ImageVector
    get() {
        if (_TextBFill != null) {
            return _TextBFill!!
        }
        _TextBFill = ImageVector.Builder(
            name = "Filled.TextBFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(168f, 156f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, -20f, 20f)
                lineTo(96f, 176f)
                lineTo(96f, 136f)
                horizontalLineToRelative(52f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 156f)
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
                moveTo(184f, 156f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -18f, -31.15f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 140f, 64f)
                lineTo(88f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                lineTo(80f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(60f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 156f)
                close()
                moveTo(160f, 100f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -20f, -20f)
                lineTo(96f, 80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(44f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 100f)
                close()
            }
        }.build()

        return _TextBFill!!
    }

@Suppress("ObjectPropertyName")
private var _TextBFill: ImageVector? = null
