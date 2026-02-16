package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ChartDonutFill: ImageVector
    get() {
        if (_ChartDonutFill != null) {
            return _ChartDonutFill!!
        }
        _ChartDonutFill = ImageVector.Builder(
            name = "Filled.ChartDonutFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(120f, 161.94f)
                verticalLineToRelative(65.34f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.46f, 4f)
                arcToRelative(104.28f, 104.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -84f, -64.5f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.69f, -5.34f)
                lineTo(97.32f, 144.5f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.35f, 1.66f)
                arcToRelative(32.25f, 32.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.59f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 161.94f)
                close()
                moveTo(128.06f, 24f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 32f)
                lineTo(120f, 88f)
                arcToRelative(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.87f, 8f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.86f, 62.15f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.73f, 3.79f)
                verticalLineToRelative(65.34f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.45f, 4f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128.06f, 24f)
                close()
                moveTo(96.06f, 125.49f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.15f, -13.42f)
                lineToRelative(0f, -0.07f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.57f, -8.87f)
                arcTo(8.36f, 8.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 97.18f, 101f)
                lineTo(48.85f, 73.06f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 37.92f, 76f)
                arcTo(104.12f, 104.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 25f, 142.68f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 30f, 146f)
                lineTo(93.22f, 129f)
                arcTo(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96.1f, 125.49f)
                close()
            }
        }.build()

        return _ChartDonutFill!!
    }

@Suppress("ObjectPropertyName")
private var _ChartDonutFill: ImageVector? = null
