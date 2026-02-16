package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.DeviceMobileSlashFill: ImageVector
    get() {
        if (_DeviceMobileSlashFill != null) {
            return _DeviceMobileSlashFill!!
        }
        _DeviceMobileSlashFill = ImageVector.Builder(
            name = "Filled.DeviceMobileSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.38f, 221.92f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.3f, -0.54f)
                lineToRelative(-2.26f, -2.48f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 240f)
                lineTo(80f, 240f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                lineTo(56f, 60.69f)
                lineTo(42.08f, 45.38f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 53.92f, 34.62f)
                lineToRelative(160f, 176f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 213.38f, 221.92f)
                close()
                moveTo(186.08f, 156.21f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 150.83f)
                lineTo(200f, 40f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, -24f)
                lineTo(76.7f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.92f, 13.38f)
                close()
            }
        }.build()

        return _DeviceMobileSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _DeviceMobileSlashFill: ImageVector? = null
