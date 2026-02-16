package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.LightningSlashFill: ImageVector
    get() {
        if (_LightningSlashFill != null) {
            return _LightningSlashFill!!
        }
        _LightningSlashFill = ImageVector.Builder(
            name = "Filled.LightningSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(105.72f, 67.81f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -5.42f)
                lineToRelative(48.39f, -51.85f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.7f, 7f)
                lineTo(153.18f, 90.9f)
                lineToRelative(57.43f, 21.53f)
                arcToRelative(8.24f, 8.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.22f, 3.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 9.63f)
                lineToRelative(-25.27f, 27.07f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.88f, 0f)
                close()
                moveTo(133.48f, 122.13f)
                lineTo(53.92f, 34.62f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 42.08f, 45.38f)
                lineTo(81.34f, 88.56f)
                lineToRelative(-39f, 41.83f)
                arcTo(8.15f, 8.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 135.31f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.16f, 8.18f)
                lineToRelative(57.63f, 21.61f)
                lineTo(88.16f, 238.43f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.69f, 7f)
                lineToRelative(61.86f, -66.28f)
                lineToRelative(38.37f, 42.2f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.84f, -10.76f)
                close()
            }
        }.build()

        return _LightningSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _LightningSlashFill: ImageVector? = null
