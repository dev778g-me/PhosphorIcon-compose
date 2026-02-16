package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.InstagramLogoFill: ImageVector
    get() {
        if (_InstagramLogoFill != null) {
            return _InstagramLogoFill!!
        }
        _InstagramLogoFill = ImageVector.Builder(
            name = "Filled.InstagramLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(160f, 128f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, -32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 128f)
                close()
                moveTo(232f, 80f)
                verticalLineToRelative(96f)
                arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, 56f)
                lineTo(80f, 232f)
                arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, -56f)
                lineTo(24f, 80f)
                arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 24f)
                horizontalLineToRelative(96f)
                arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 80f)
                close()
                moveTo(176f, 128f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, -48f, 48f)
                arcTo(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 128f)
                close()
                moveTo(200f, 68f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 68f)
                close()
            }
        }.build()

        return _InstagramLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _InstagramLogoFill: ImageVector? = null
