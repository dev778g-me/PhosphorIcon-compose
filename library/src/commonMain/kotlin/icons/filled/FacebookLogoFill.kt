package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FacebookLogoFill: ImageVector
    get() {
        if (_FacebookLogoFill != null) {
            return _FacebookLogoFill!!
        }
        _FacebookLogoFill = ImageVector.Builder(
            name = "Filled.FacebookLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 128f)
                arcToRelative(104.16f, 104.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -91.55f, 103.26f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.45f, -4f)
                verticalLineTo(152f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8.53f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.25f, -7.47f)
                horizontalLineTo(136f)
                verticalLineTo(112f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8.53f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 167.73f, 80f)
                horizontalLineTo(152f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, 32f)
                verticalLineToRelative(24f)
                horizontalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8.53f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96.27f, 152f)
                horizontalLineTo(120f)
                verticalLineToRelative(75.28f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.44f, 4f)
                arcTo(104.15f, 104.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24.07f, 124.09f)
                curveToRelative(2f, -54f, 45.74f, -97.9f, 99.78f, -100f)
                arcTo(104.12f, 104.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 128f)
                close()
            }
        }.build()

        return _FacebookLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _FacebookLogoFill: ImageVector? = null
