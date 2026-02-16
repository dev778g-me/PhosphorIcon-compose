package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ShuffleAngularFill: ImageVector
    get() {
        if (_ShuffleAngularFill != null) {
            return _ShuffleAngularFill!!
        }
        _ShuffleAngularFill = ImageVector.Builder(
            name = "Filled.ShuffleAngularFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(237.66f, 178.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.32f)
                lineToRelative(-24f, 24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 208f)
                lineTo(200f, 192f)
                lineTo(168f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.51f, -3.35f)
                lineTo(83.88f, 80f)
                lineTo(32f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(88f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.51f, 3.35f)
                lineTo(172.12f, 176f)
                lineTo(200f, 176f)
                lineTo(200f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                close()
                moveTo(143f, 107f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.16f, -1.86f)
                lineToRelative(18f, -25.12f)
                lineTo(200f, 80.02f)
                lineTo(200f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.66f, 5.66f)
                lineToRelative(24f, -24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -11.32f)
                lineToRelative(-24f, -24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 48f)
                lineTo(200f, 64f)
                lineTo(168f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.51f, 3.35f)
                lineTo(141.15f, 95.82f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 143f, 107f)
                close()
                moveTo(113f, 149f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.16f, 1.86f)
                lineTo(83.88f, 176f)
                lineTo(32f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(88f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.51f, -3.35f)
                lineToRelative(20.34f, -28.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 113f, 149f)
                close()
            }
        }.build()

        return _ShuffleAngularFill!!
    }

@Suppress("ObjectPropertyName")
private var _ShuffleAngularFill: ImageVector? = null
