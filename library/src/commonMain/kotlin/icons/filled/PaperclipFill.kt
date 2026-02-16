package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PaperclipFill: ImageVector
    get() {
        if (_PaperclipFill != null) {
            return _PaperclipFill!!
        }
        _PaperclipFill = ImageVector.Builder(
            name = "Filled.PaperclipFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(165.66f, 74.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 0f)
                lineTo(87.09f, 143f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, 121f, 177f)
                lineToRelative(49.32f, -50.32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 11.42f, 11.2f)
                lineToRelative(-49.37f, 50.38f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -56.62f, -56.51f)
                lineTo(143f, 63.09f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 177f, 97f)
                lineTo(109.71f, 165.6f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.42f, -11.2f)
                lineTo(165.6f, 85.71f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.06f, -11.37f)
                close()
            }
        }.build()

        return _PaperclipFill!!
    }

@Suppress("ObjectPropertyName")
private var _PaperclipFill: ImageVector? = null
