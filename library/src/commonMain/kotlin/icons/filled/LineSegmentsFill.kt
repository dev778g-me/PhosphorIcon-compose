package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.LineSegmentsFill: ImageVector
    get() {
        if (_LineSegmentsFill != null) {
            return _LineSegmentsFill!!
        }
        _LineSegmentsFill = ImageVector.Builder(
            name = "Filled.LineSegmentsFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(235.81f, 75.79f)
                arcTo(27.91f, 27.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 84f)
                arcToRelative(28.49f, 28.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.67f, -0.58f)
                lineToRelative(-30.57f, 56.77f)
                lineToRelative(0f, 0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -44.43f, 6.49f)
                lineToRelative(-26.06f, -26.06f)
                arcTo(28.07f, 28.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 124f)
                arcToRelative(28.41f, 28.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.67f, -0.58f)
                lineTo(59.76f, 180.18f)
                lineToRelative(0f, 0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -39.6f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 25.47f, -7.61f)
                lineToRelative(30.57f, -56.77f)
                lineToRelative(0f, 0f)
                arcToRelative(28.05f, 28.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -39.61f)
                horizontalLineToRelative(0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 44.43f, 33.12f)
                lineToRelative(26.06f, 26.06f)
                arcToRelative(28.1f, 28.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, -2.77f)
                lineToRelative(30.57f, -56.77f)
                lineToRelative(0f, 0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -39.6f)
                horizontalLineToRelative(0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 39.6f, 39.6f)
                close()
            }
        }.build()

        return _LineSegmentsFill!!
    }

@Suppress("ObjectPropertyName")
private var _LineSegmentsFill: ImageVector? = null
