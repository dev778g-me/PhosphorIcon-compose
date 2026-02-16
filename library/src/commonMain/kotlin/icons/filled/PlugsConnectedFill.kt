package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PlugsConnectedFill: ImageVector
    get() {
        if (_PlugsConnectedFill != null) {
            return _PlugsConnectedFill!!
        }
        _PlugsConnectedFill = ImageVector.Builder(
            name = "Filled.PlugsConnectedFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(88.57f, 35f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.43f, 29f)
                lineToRelative(8f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96.57f, 55f)
                close()
                moveTo(29f, 103.43f)
                lineToRelative(20f, 8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 55f, 96.57f)
                lineToRelative(-20f, -8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 29f, 103.43f)
                close()
                moveTo(227f, 152.57f)
                lineToRelative(-20f, -8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 201f, 159.43f)
                lineToRelative(20f, 8f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 227f, 152.57f)
                close()
                moveTo(159.43f, 201f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144.57f, 207f)
                lineToRelative(8f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 167.43f, 221f)
                close()
                moveTo(237.91f, 18.52f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.5f, -0.18f)
                lineTo(174f, 70.75f)
                lineToRelative(-5.38f, -5.38f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -45.28f, 0f)
                lineTo(106.14f, 82.54f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.66f)
                lineToRelative(61.7f, 61.66f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.66f, 0f)
                lineToRelative(16.74f, -16.74f)
                arcToRelative(32.76f, 32.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.81f, -22.52f)
                arcToRelative(31.82f, 31.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.37f, -23.17f)
                lineToRelative(-5.38f, -5.37f)
                lineToRelative(52.2f, -52.17f)
                arcTo(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 237.91f, 18.52f)
                close()
                moveTo(85.64f, 90.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.49f, 0.18f)
                arcToRelative(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.41f, 11.37f)
                lineTo(80.67f, 108f)
                lineTo(65.34f, 123.31f)
                arcTo(31.82f, 31.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 146.47f)
                arcTo(32.75f, 32.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 65.77f, 169f)
                lineToRelative(5f, 4.94f)
                lineTo(18.49f, 226.13f)
                arcToRelative(8.21f, 8.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.61f, 11.1f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.72f, 0.43f)
                lineTo(82f, 185.25f)
                lineToRelative(5.37f, 5.38f)
                arcToRelative(32.1f, 32.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 45.29f, 0f)
                lineTo(148f, 175.31f)
                lineToRelative(6.34f, 6.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, -11.32f)
                close()
            }
        }.build()

        return _PlugsConnectedFill!!
    }

@Suppress("ObjectPropertyName")
private var _PlugsConnectedFill: ImageVector? = null
