package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HandCoinsFill: ImageVector
    get() {
        if (_HandCoinsFill != null) {
            return _HandCoinsFill!!
        }
        _HandCoinsFill = ImageVector.Builder(
            name = "Filled.HandCoinsFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128.09f, 57.38f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 55.17f, -27.82f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.56f, 7f)
                arcTo(52.06f, 52.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 84f)
                curveToRelative(0f, 1.17f, 0f, 2.34f, 0.12f, 3.49f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 3.76f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128.09f, 57.38f)
                close()
                moveTo(240f, 160.61f)
                arcToRelative(24.47f, 24.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, -13.6f, 22f)
                lineToRelative(-0.44f, 0.2f)
                lineToRelative(-38.83f, 16.54f)
                arcToRelative(6.94f, 6.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.19f, 0.4f)
                lineToRelative(-64f, 16f)
                arcTo(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 216f)
                lineTo(16f, 216f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 200f)
                lineTo(0f, 160f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
                lineTo(44.69f, 144f)
                lineToRelative(22.62f, -22.63f)
                arcTo(31.82f, 31.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 89.94f, 112f)
                lineTo(140f, 112f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.25f, 34.45f)
                lineToRelative(41.84f, -9.62f)
                arcTo(24.61f, 24.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 160.61f)
                close()
                moveTo(224f, 160.61f)
                arcToRelative(8.61f, 8.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.87f, -8.3f)
                lineToRelative(-0.31f, 0.08f)
                lineToRelative(-67f, 15.41f)
                arcToRelative(8.32f, 8.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.79f, 0.2f)
                lineTo(112f, 168f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(28f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -24f)
                lineTo(89.94f, 128f)
                arcToRelative(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.31f, 4.69f)
                lineTo(56f, 155.31f)
                lineTo(56f, 200f)
                horizontalLineToRelative(63f)
                lineToRelative(62.43f, -15.61f)
                lineToRelative(38f, -16.18f)
                arcTo(8.56f, 8.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 160.61f)
                close()
                moveTo(168f, 84f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 36f, -36f)
                arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 84f)
                close()
            }
        }.build()

        return _HandCoinsFill!!
    }

@Suppress("ObjectPropertyName")
private var _HandCoinsFill: ImageVector? = null
