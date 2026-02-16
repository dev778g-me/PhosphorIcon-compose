package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ThumbsUpFill: ImageVector
    get() {
        if (_ThumbsUpFill != null) {
            return _ThumbsUpFill!!
        }
        _ThumbsUpFill = ImageVector.Builder(
            name = "Filled.ThumbsUpFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(234f, 80.12f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 72f)
                horizontalLineTo(160f)
                verticalLineTo(56f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, -40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.16f, 4.42f)
                lineTo(75.06f, 96f)
                horizontalLineTo(32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                verticalLineToRelative(88f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(204f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.82f, -21f)
                lineToRelative(12f, -96f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 234f, 80.12f)
                close()
                moveTo(32f, 112f)
                horizontalLineTo(72f)
                verticalLineToRelative(88f)
                horizontalLineTo(32f)
                close()
            }
        }.build()

        return _ThumbsUpFill!!
    }

@Suppress("ObjectPropertyName")
private var _ThumbsUpFill: ImageVector? = null
