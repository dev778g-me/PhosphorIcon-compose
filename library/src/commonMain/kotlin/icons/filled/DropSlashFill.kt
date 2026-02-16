package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.DropSlashFill: ImageVector
    get() {
        if (_DropSlashFill != null) {
            return _DropSlashFill!!
        }
        _DropSlashFill = ImageVector.Builder(
            name = "Filled.DropSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(213.92f, 210.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -11.84f, 10.76f)
                lineToRelative(-12.9f, -14.19f)
                arcTo(87.71f, 87.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 232f)
                curveToRelative(-48f, 0f, -87.49f, -38.93f, -88f, -86.88f)
                curveToRelative(-0.27f, -24.34f, 8.22f, -49.84f, 24.73f, -74.81f)
                lineTo(42.3f, 45.63f)
                arcToRelative(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.14f, -11.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.48f, 0.37f)
                close()
                moveTo(203.85f, 175.76f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.7f, -1.27f)
                arcTo(87.66f, 87.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 144f)
                curveToRelative(0f, -31.4f, -14.51f, -64.68f, -42f, -96.25f)
                arcToRelative(254.19f, 254.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -41.45f, -38.3f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.18f, 0f)
                arcTo(251.26f, 251.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 87.17f, 42f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.41f)
                close()
            }
        }.build()

        return _DropSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _DropSlashFill: ImageVector? = null
