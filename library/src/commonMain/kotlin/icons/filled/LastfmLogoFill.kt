package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.LastfmLogoFill: ImageVector
    get() {
        if (_LastfmLogoFill != null) {
            return _LastfmLogoFill!!
        }
        _LastfmLogoFill = ImageVector.Builder(
            name = "Filled.LastfmLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 40f)
                horizontalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                verticalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 40f)
                close()
                moveTo(184f, 184f)
                horizontalLineTo(172.61f)
                arcToRelative(40.09f, 40.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -36.42f, -23.45f)
                lineToRelative(-23f, -50.48f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 91.39f, 96f)
                horizontalLineTo(80f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, 24f)
                verticalLineToRelative(24f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                horizontalLineToRelative(8f)
                arcToRelative(23.92f, 23.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.74f, -9f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12.48f, 10f)
                arcTo(39.83f, 39.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 184f)
                horizontalLineTo(80f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40f, -40f)
                verticalLineTo(120f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 80f)
                horizontalLineTo(91.39f)
                arcToRelative(40.09f, 40.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36.42f, 23.45f)
                lineToRelative(22.95f, 50.48f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 172.61f, 168f)
                horizontalLineTo(184f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -32f)
                horizontalLineToRelative(-8f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -56f)
                horizontalLineToRelative(12f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                horizontalLineTo(176f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 24f)
                horizontalLineToRelative(8f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 64f)
                close()
            }
        }.build()

        return _LastfmLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _LastfmLogoFill: ImageVector? = null
