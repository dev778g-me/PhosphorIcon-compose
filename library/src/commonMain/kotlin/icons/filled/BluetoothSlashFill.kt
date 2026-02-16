package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BluetoothSlashFill: ImageVector
    get() {
        if (_BluetoothSlashFill != null) {
            return _BluetoothSlashFill!!
        }
        _BluetoothSlashFill = ImageVector.Builder(
            name = "Filled.BluetoothSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(221.38f, 221.92f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.3f, -0.54f)
                lineToRelative(-26.45f, -29.1f)
                lineTo(132.8f, 230.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.89f, 0.47f)
                arcToRelative(8.29f, 8.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.91f, -7.18f)
                verticalLineTo(144f)
                lineTo(68.8f, 182.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.16f, -1.55f)
                arcToRelative(8.26f, 8.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.81f, -11.43f)
                lineToRelative(61.47f, -46.11f)
                lineTo(50.08f, 45.38f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 61.92f, 34.62f)
                lineToRelative(160f, 176f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 221.38f, 221.92f)
                close()
                moveTo(155f, 113.22f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.36f, 0.51f)
                lineTo(196.8f, 86.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -12.8f)
                lineToRelative(-64f, -48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10f, 0.29f)
                arcTo(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 32.24f)
                verticalLineTo(73.18f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 2.69f)
                close()
            }
        }.build()

        return _BluetoothSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _BluetoothSlashFill: ImageVector? = null
