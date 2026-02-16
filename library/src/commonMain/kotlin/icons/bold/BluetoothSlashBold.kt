package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.BluetoothSlashBold: ImageVector
    get() {
        if (_BluetoothSlashBold != null) {
            return _BluetoothSlashBold!!
        }
        _BluetoothSlashBold = ImageVector.Builder(
            name = "Bold.BluetoothSlashBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 176f)
                lineTo(128f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 40f)
                lineTo(216f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184.65f, 181.51f)
                lineToRelative(-56.65f, 42.49f)
                lineToRelative(0f, -96f)
                lineToRelative(25.14f, 18.86f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 59.74f)
                lineToRelative(0f, -27.74f)
                lineToRelative(64f, 48f)
                lineToRelative(-27.1f, 20.33f)
            }
        }.build()

        return _BluetoothSlashBold!!
    }

@Suppress("ObjectPropertyName")
private var _BluetoothSlashBold: ImageVector? = null
