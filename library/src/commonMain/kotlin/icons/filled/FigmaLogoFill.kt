package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FigmaLogoFill: ImageVector
    get() {
        if (_FigmaLogoFill != null) {
            return _FigmaLogoFill!!
        }
        _FigmaLogoFill = ImageVector.Builder(
            name = "Filled.FigmaLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(192f, 96f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, -72f)
                lineTo(96f, 24f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 96f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.37f, 65f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = false, 144f, 196f)
                lineTo(144f, 160f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 48f, -64f)
                close()
                moveTo(128f, 152f)
                lineTo(96f, 152f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -48f)
                horizontalLineToRelative(32f)
                close()
                moveTo(168f, 88f)
                lineTo(144f, 88f)
                lineTo(144f, 40f)
                horizontalLineToRelative(24f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 48f)
                close()
            }
        }.build()

        return _FigmaLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _FigmaLogoFill: ImageVector? = null
