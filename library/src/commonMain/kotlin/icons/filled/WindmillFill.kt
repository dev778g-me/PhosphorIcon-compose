package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.WindmillFill: ImageVector
    get() {
        if (_WindmillFill != null) {
            return _WindmillFill!!
        }
        _WindmillFill = ImageVector.Builder(
            name = "Filled.WindmillFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 231.47f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.25f, -7.47f)
                horizontalLineTo(182.94f)
                lineToRelative(-6.3f, -44.12f)
                lineToRelative(3.24f, 1.91f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.91f, -5.67f)
                lineToRelative(11.81f, -20f)
                arcToRelative(16.49f, 16.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.11f, -11.49f)
                arcToRelative(15.92f, 15.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.6f, -10.74f)
                lineTo(148.93f, 99f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.33f, -10.63f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.21f, -3.3f)
                lineToRelative(20.95f, 12.33f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 183.24f, 96f)
                lineToRelative(30.55f, -51.9f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.67f, -21.92f)
                lineToRelative(-20.34f, -12f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -21.91f, 5.67f)
                lineToRelative(-35f, 59.42f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.79f, 2.27f)
                arcTo(8.13f, 8.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 117.21f, 67f)
                lineToRelative(12.23f, -20.78f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 40.76f)
                lineTo(76.12f, 10.22f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -21.91f, 5.67f)
                lineToRelative(-11.81f, 20f)
                arcToRelative(16.47f, 16.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.11f, 11.48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.6f, 10.75f)
                lineTo(107.08f, 93f)
                arcToRelative(8.16f, 8.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.47f, 10.3f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.36f, 3.62f)
                lineToRelative(-21f, -12.34f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72.76f, 96f)
                lineToRelative(-30.55f, 51.9f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.67f, 21.91f)
                lineToRelative(20.34f, 12f)
                arcToRelative(15.57f, 15.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.58f, 2f)
                lineTo(73.06f, 224f)
                horizontalLineTo(32.27f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 231.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 240f)
                horizontalLineTo(224f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 231.47f)
                close()
                moveTo(89.22f, 224f)
                lineTo(98f, 162.8f)
                lineToRelative(12.77f, -21.7f)
                horizontalLineToRelative(0f)
                lineTo(125f, 116.93f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.62f, -3.33f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.3f, 11.21f)
                lineToRelative(-12.33f, 21f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.42f, 5.47f)
                lineToRelative(31f, 18.25f)
                lineTo(166.78f, 224f)
                close()
            }
        }.build()

        return _WindmillFill!!
    }

@Suppress("ObjectPropertyName")
private var _WindmillFill: ImageVector? = null
