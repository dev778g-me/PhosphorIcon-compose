package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.SmileyMeltingFill: ImageVector
    get() {
        if (_SmileyMeltingFill != null) {
            return _SmileyMeltingFill!!
        }
        _SmileyMeltingFill = ImageVector.Builder(
            name = "Filled.SmileyMeltingFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(235.6f, 176f)
                lineTo(220.24f, 176f)
                arcToRelative(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, -184.52f, 0f)
                lineTo(20.4f, 176f)
                arcTo(12.26f, 12.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 187.78f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 200f)
                lineTo(80f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(72.16f, 216f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 6.33f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 232f)
                lineTo(199.73f, 232f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.25f, -7.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8.53f)
                lineTo(144f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(7.79f)
                arcToRelative(8.28f, 8.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.15f, -7.05f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 184f)
                lineTo(136f, 184f)
                curveToRelative(-14.93f, 0f, -30.59f, -5.78f, -43f, -15.85f)
                curveToRelative(-13.55f, -11f, -21f, -25.27f, -21f, -40.15f)
                arcToRelative(57f, 57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.71f, -9f)
                arcToRelative(8.21f, 8.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.85f, -7f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 9.27f)
                arcTo(41.33f, 41.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 128f)
                curveToRelative(0f, 22.16f, 26.26f, 40f, 48f, 40f)
                horizontalLineToRelative(15.44f)
                curveToRelative(13.5f, 0f, 24.86f, 11.05f, 24.55f, 24.55f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.23f, 2.83f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4.62f)
                lineTo(236f, 200f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -12.22f)
                arcTo(12.26f, 12.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 235.6f, 176f)
                close()
                moveTo(127.9f, 93.56f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 114.44f, 80.1f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 127.9f, 93.56f)
                close()
                moveTo(175.9f, 141.56f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -13.46f, -13.46f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 175.9f, 141.56f)
                close()
            }
        }.build()

        return _SmileyMeltingFill!!
    }

@Suppress("ObjectPropertyName")
private var _SmileyMeltingFill: ImageVector? = null
