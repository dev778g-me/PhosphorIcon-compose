package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MoneyFill: ImageVector
    get() {
        if (_MoneyFill != null) {
            return _MoneyFill!!
        }
        _MoneyFill = ImageVector.Builder(
            name = "Filled.MoneyFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(168f, 128f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, -40f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 128f)
                close()
                moveTo(248f, 64f)
                lineTo(248f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(16f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                lineTo(8f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                lineTo(240f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 248f, 64f)
                close()
                moveTo(232f, 110.35f)
                arcTo(56.78f, 56.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 193.65f, 72f)
                lineTo(62.35f, 72f)
                arcTo(56.78f, 56.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 110.35f)
                verticalLineToRelative(35.3f)
                arcTo(56.78f, 56.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 62.35f, 184f)
                horizontalLineToRelative(131.3f)
                arcTo(56.78f, 56.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 145.65f)
                close()
            }
        }.build()

        return _MoneyFill!!
    }

@Suppress("ObjectPropertyName")
private var _MoneyFill: ImageVector? = null
