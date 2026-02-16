package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.DressFill: ImageVector
    get() {
        if (_DressFill != null) {
            return _DressFill!!
        }
        _DressFill = ImageVector.Builder(
            name = "Filled.DressFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(66.26f, 80.23f)
                arcToRelative(15.26f, 15.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.65f, -12.17f)
                arcToRelative(15.54f, 15.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -4.76f)
                lineTo(88f, 32.7f)
                lineTo(88f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.53f, -8f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 8.27f)
                lineTo(104f, 32.42f)
                lineTo(109.25f, 39f)
                arcToRelative(23.91f, 23.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.13f, 9f)
                arcToRelative(24.67f, 24.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.71f, -9.43f)
                lineTo(152f, 32.42f)
                lineTo(152f, 8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.53f, -8f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 8.27f)
                lineTo(168f, 32.7f)
                lineToRelative(21.42f, 30.6f)
                arcToRelative(15.54f, 15.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 4.76f)
                arcToRelative(15.26f, 15.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.65f, 12.17f)
                arcToRelative(1.74f, 1.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.11f, 0.18f)
                lineToRelative(-13.85f, 21.74f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 172.4f, 104f)
                lineTo(83.6f, 104f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.38f, -1.85f)
                lineTo(66.37f, 80.41f)
                arcTo(1.74f, 1.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 66.26f, 80.23f)
                close()
                moveTo(214.76f, 209.79f)
                arcToRelative(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.15f, -0.34f)
                lineTo(173.69f, 122.3f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.63f, -2.3f)
                lineTo(85.94f, 120f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.63f, 2.3f)
                lineTo(41.39f, 209.45f)
                arcToRelative(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.15f, 0.34f)
                arcTo(16.19f, 16.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 41.6f, 223f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 232f)
                lineTo(200f, 232f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.39f, -9f)
                arcTo(16.19f, 16.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 214.76f, 209.79f)
                close()
            }
        }.build()

        return _DressFill!!
    }

@Suppress("ObjectPropertyName")
private var _DressFill: ImageVector? = null
