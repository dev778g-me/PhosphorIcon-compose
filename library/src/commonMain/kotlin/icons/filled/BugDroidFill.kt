package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BugDroidFill: ImageVector
    get() {
        if (_BugDroidFill != null) {
            return _BugDroidFill!!
        }
        _BugDroidFill = ImageVector.Builder(
            name = "Filled.BugDroidFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(191.83f, 51.48f)
                lineToRelative(13.83f, -13.82f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, -11.32f)
                lineTo(179.79f, 40.9f)
                arcToRelative(87.81f, 87.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, -103.58f, 0f)
                lineTo(61.66f, 26.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 50.34f, 37.66f)
                lineTo(64.17f, 51.48f)
                arcTo(87.72f, 87.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 112f)
                verticalLineToRelative(40f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 0f)
                lineTo(216f, 112f)
                arcTo(87.72f, 87.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 191.83f, 51.48f)
                close()
                moveTo(128f, 40f)
                arcToRelative(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 72f)
                verticalLineToRelative(8f)
                lineTo(56f, 120f)
                verticalLineToRelative(-8f)
                arcTo(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 40f)
                close()
                moveTo(144f, 92f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 92f)
                close()
                moveTo(88f, 92f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 92f)
                close()
            }
        }.build()

        return _BugDroidFill!!
    }

@Suppress("ObjectPropertyName")
private var _BugDroidFill: ImageVector? = null
