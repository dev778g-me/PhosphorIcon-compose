package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PasswordFill: ImageVector
    get() {
        if (_PasswordFill != null) {
            return _PasswordFill!!
        }
        _PasswordFill = ImageVector.Builder(
            name = "Filled.PasswordFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 48f)
                lineTo(32f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 64f)
                lineTo(16f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(224f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(240f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 48f)
                close()
                moveTo(204.58f, 142.71f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -13f, 9.41f)
                lineTo(184f, 141.61f)
                lineToRelative(-7.63f, 10.51f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -13f, -9.41f)
                lineToRelative(7.64f, -10.5f)
                lineToRelative(-12.36f, -4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, -15.21f)
                lineTo(176f, 117f)
                lineTo(176f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(13f)
                lineToRelative(12.35f, -4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 15.21f)
                lineToRelative(-12.36f, 4f)
                close()
                moveTo(132.58f, 142.71f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -13f, 9.41f)
                lineTo(112f, 141.61f)
                lineToRelative(-7.63f, 10.51f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -13f, -9.41f)
                lineToRelative(7.64f, -10.5f)
                lineToRelative(-12.36f, -4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, -15.21f)
                lineTo(104f, 117f)
                lineTo(104f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(13f)
                lineToRelative(12.35f, -4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 15.21f)
                lineToRelative(-12.36f, 4f)
                close()
                moveTo(64f, 88f)
                verticalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(48f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
            }
        }.build()

        return _PasswordFill!!
    }

@Suppress("ObjectPropertyName")
private var _PasswordFill: ImageVector? = null
