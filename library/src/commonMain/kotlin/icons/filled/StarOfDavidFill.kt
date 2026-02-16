package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.StarOfDavidFill: ImageVector
    get() {
        if (_StarOfDavidFill != null) {
            return _StarOfDavidFill!!
        }
        _StarOfDavidFill = ImageVector.Builder(
            name = "Filled.StarOfDavidFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(201.21f, 128f)
                lineTo(231f, 76f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 64f)
                lineTo(164.65f, 64f)
                lineTo(135f, 12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.9f, 0f)
                lineTo(91.33f, 64f)
                lineTo(32f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.95f, 12f)
                lineToRelative(29.72f, 52f)
                lineTo(25.05f, 180f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 12f)
                lineTo(91.33f, 192f)
                lineToRelative(29.72f, 52f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.9f, 0f)
                lineToRelative(29.7f, -52f)
                lineTo(224f, 192f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 231f, 180f)
                close()
                moveTo(182.79f, 128f)
                lineTo(155.37f, 176f)
                lineTo(100.62f, 176f)
                lineTo(73.2f, 128f)
                lineToRelative(27.42f, -48f)
                lineToRelative(54.75f, 0f)
                close()
            }
        }.build()

        return _StarOfDavidFill!!
    }

@Suppress("ObjectPropertyName")
private var _StarOfDavidFill: ImageVector? = null
