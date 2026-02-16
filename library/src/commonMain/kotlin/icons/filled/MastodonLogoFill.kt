package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MastodonLogoFill: ImageVector
    get() {
        if (_MastodonLogoFill != null) {
            return _MastodonLogoFill!!
        }
        _MastodonLogoFill = ImageVector.Builder(
            name = "Filled.MastodonLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(184f, 32f)
                lineTo(72f, 32f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 72f)
                lineTo(32f, 192f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                horizontalLineToRelative(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(72f, 216f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                verticalLineToRelative(-8f)
                lineTo(184f, 184f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, -40f)
                lineTo(224f, 72f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184f, 32f)
                close()
                moveTo(184f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(168f, 104f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, 0f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(120f, 104f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, 0f)
                verticalLineToRelative(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(72f, 104f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, -21.13f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 104f)
                close()
            }
        }.build()

        return _MastodonLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _MastodonLogoFill: ImageVector? = null
