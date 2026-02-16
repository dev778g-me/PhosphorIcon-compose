package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.GenderTransgenderFill: ImageVector
    get() {
        if (_GenderTransgenderFill != null) {
            return _GenderTransgenderFill!!
        }
        _GenderTransgenderFill = ImageVector.Builder(
            name = "Filled.GenderTransgenderFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(127.92f, 150f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -22f, -22f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 127.92f, 150f)
                close()
                moveTo(216f, 40f)
                verticalLineTo(216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineTo(56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                verticalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 24f)
                horizontalLineTo(200f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 40f)
                close()
                moveTo(192f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                horizontalLineTo(156.27f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 148f, 71.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 156f, 80f)
                horizontalLineToRelative(8.69f)
                lineTo(148f, 96.69f)
                lineTo(137.66f, 86.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.49f, 0.18f)
                arcToRelative(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.41f, 11.37f)
                lineTo(136.69f, 108f)
                lineTo(126f, 118.64f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 137.36f, 130f)
                lineTo(148f, 119.31f)
                lineToRelative(10.34f, 10.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.71f, -0.43f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, -11.1f)
                lineTo(159.31f, 108f)
                lineTo(176f, 91.31f)
                verticalLineToRelative(8.42f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.47f, 8.25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.53f, -8f)
                close()
            }
        }.build()

        return _GenderTransgenderFill!!
    }

@Suppress("ObjectPropertyName")
private var _GenderTransgenderFill: ImageVector? = null
