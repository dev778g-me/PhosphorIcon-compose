package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ShuffleFill: ImageVector
    get() {
        if (_ShuffleFill != null) {
            return _ShuffleFill!!
        }
        _ShuffleFill = ImageVector.Builder(
            name = "Filled.ShuffleFill",
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
                arcToRelative(72.15f, 72.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, -57.65f, -30.14f)
                lineToRelative(-41.72f, -58.4f)
                arcTo(56.1f, 56.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 55.06f, 80f)
                lineTo(32f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(55.06f, 64f)
                arcToRelative(72.12f, 72.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 58.59f, 30.15f)
                lineToRelative(41.72f, 58.4f)
                arcTo(56.08f, 56.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 176f)
                lineTo(200f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.66f, -5.66f)
                close()
                moveTo(143f, 107f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.16f, -1.86f)
                lineToRelative(1.2f, -1.67f)
                arcTo(56.08f, 56.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 80f)
                lineTo(200f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.66f, 5.66f)
                lineToRelative(24f, -24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -11.32f)
                lineToRelative(-24f, -24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 48f)
                lineTo(200f, 64f)
                arcToRelative(72.15f, 72.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, -57.65f, 30.14f)
                lineToRelative(-1.2f, 1.67f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 143f, 107f)
                close()
                moveTo(113f, 149f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.16f, 1.86f)
                lineToRelative(-1.2f, 1.67f)
                arcTo(56.1f, 56.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 55.06f, 176f)
                lineTo(32f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(55.06f, 192f)
                arcToRelative(72.12f, 72.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 58.59f, -30.15f)
                lineToRelative(1.2f, -1.67f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 113f, 149f)
                close()
            }
        }.build()

        return _ShuffleFill!!
    }

@Suppress("ObjectPropertyName")
private var _ShuffleFill: ImageVector? = null
