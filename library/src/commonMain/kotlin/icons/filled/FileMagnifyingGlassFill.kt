package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FileMagnifyingGlassFill: ImageVector
    get() {
        if (_FileMagnifyingGlassFill != null) {
            return _FileMagnifyingGlassFill!!
        }
        _FileMagnifyingGlassFill = ImageVector.Builder(
            name = "Filled.FileMagnifyingGlassFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(144f, 148f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, -20f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 148f)
                close()
                moveTo(216f, 88f)
                lineTo(216f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(56f, 232f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 24f)
                horizontalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 2.34f)
                lineToRelative(56f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 88f)
                close()
                moveTo(165.66f, 178.34f)
                lineTo(154.46f, 167.15f)
                arcToRelative(36.05f, 36.05f, 0f, isMoreThanHalf = true, isPositiveArc = false, -11.31f, 11.31f)
                lineToRelative(11.19f, 11.2f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, -11.32f)
                close()
                moveTo(196f, 88f)
                lineTo(152f, 44f)
                lineTo(152f, 88f)
                close()
            }
        }.build()

        return _FileMagnifyingGlassFill!!
    }

@Suppress("ObjectPropertyName")
private var _FileMagnifyingGlassFill: ImageVector? = null
