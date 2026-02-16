package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PhoneIncomingFill: ImageVector
    get() {
        if (_PhoneIncomingFill != null) {
            return _PhoneIncomingFill!!
        }
        _PhoneIncomingFill = ImageVector.Builder(
            name = "Filled.PhoneIncomingFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(223.88f, 183.08f)
                arcTo(56.26f, 56.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 232f)
                curveTo(88.6f, 232f, 24f, 167.4f, 24f, 88f)
                arcTo(56.26f, 56.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72.92f, 32.12f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.62f, 9.52f)
                lineToRelative(21.12f, 47.15f)
                lineToRelative(0f, 0.12f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 109.39f, 104f)
                curveToRelative(-0.18f, 0.27f, -0.37f, 0.52f, -0.57f, 0.77f)
                lineTo(88f, 129.45f)
                curveToRelative(7.49f, 15.22f, 23.41f, 31f, 38.83f, 38.51f)
                lineToRelative(24.34f, -20.71f)
                arcToRelative(8.12f, 8.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.17f, -1.4f)
                lineToRelative(0.13f, 0.06f)
                lineToRelative(47.11f, 21.11f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 223.88f, 183.08f)
                close()
                moveTo(152f, 112f)
                horizontalLineToRelative(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                horizontalLineTo(171.32f)
                lineToRelative(34.34f, -34.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, -11.32f)
                lineTo(160f, 84.69f)
                verticalLineTo(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(40f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 112f)
                close()
            }
        }.build()

        return _PhoneIncomingFill!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneIncomingFill: ImageVector? = null
