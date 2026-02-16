package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HandArrowUpFill: ImageVector
    get() {
        if (_HandArrowUpFill != null) {
            return _HandArrowUpFill!!
        }
        _HandArrowUpFill = ImageVector.Builder(
            name = "Filled.HandArrowUpFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(230.33f, 141.06f)
                arcToRelative(24.43f, 24.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, -21.24f, -4.23f)
                lineToRelative(-41.84f, 9.62f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 140f, 112f)
                lineTo(89.94f, 112f)
                arcToRelative(31.82f, 31.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.63f, 9.37f)
                lineTo(44.69f, 144f)
                lineTo(16f, 144f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 160f)
                verticalLineToRelative(40f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(120f, 216f)
                arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.94f, -0.24f)
                lineToRelative(64f, -16f)
                arcToRelative(7.35f, 7.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.2f, -0.4f)
                lineTo(226f, 182.82f)
                lineToRelative(0.44f, -0.2f)
                arcToRelative(24.6f, 24.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.93f, -41.56f)
                close()
                moveTo(219.43f, 168.21f)
                lineTo(181.43f, 184.39f)
                lineTo(119f, 200f)
                lineTo(56f, 200f)
                lineTo(56f, 155.31f)
                lineToRelative(22.63f, -22.62f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 89.94f, 128f)
                lineTo(140f, 128f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 24f)
                lineTo(112f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(32f)
                arcToRelative(8.32f, 8.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.79f, -0.2f)
                lineToRelative(67f, -15.41f)
                lineToRelative(0.31f, -0.08f)
                arcToRelative(8.6f, 8.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.3f, 15.9f)
                close()
                moveTo(154.34f, 61.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -11.32f)
                lineToRelative(32f, -32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineToRelative(32f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 11.32f)
                lineTo(200f, 43.31f)
                lineTo(200f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(184f, 43.31f)
                lineTo(165.66f, 61.66f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 154.34f, 61.66f)
                close()
            }
        }.build()

        return _HandArrowUpFill!!
    }

@Suppress("ObjectPropertyName")
private var _HandArrowUpFill: ImageVector? = null
