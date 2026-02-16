package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.SubtitlesSlashFill: ImageVector
    get() {
        if (_SubtitlesSlashFill != null) {
            return _SubtitlesSlashFill!!
        }
        _SubtitlesSlashFill = ImageVector.Builder(
            name = "Filled.SubtitlesSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(53.92f, 34.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.48f, -0.37f)
                arcToRelative(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.14f, 11.38f)
                lineTo(44.46f, 48f)
                lineTo(32f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 64f)
                lineTo(16f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(189.92f, 208f)
                lineToRelative(12.16f, 13.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.33f, 0.51f)
                arcToRelative(8.31f, 8.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.3f, -11.51f)
                close()
                moveTo(104f, 128f)
                horizontalLineToRelative(13.19f)
                lineToRelative(14.54f, 16f)
                lineTo(104.27f, 144f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 136.53f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 128f)
                close()
                moveTo(56f, 128f)
                lineTo(72f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8.53f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 71.73f, 144f)
                lineTo(56.27f, 144f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 136.53f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 128f)
                close()
                moveTo(152f, 176f)
                lineTo(56.27f, 176f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 168.53f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 160f)
                horizontalLineToRelative(90.28f)
                lineToRelative(11.9f, 13.09f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 176f)
                close()
                moveTo(240f, 64f)
                lineTo(240f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.19f, 11.78f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.7f, -0.24f)
                lineTo(175f, 144f)
                horizontalLineToRelative(25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8.53f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.25f, -7.47f)
                horizontalLineToRelative(-39.3f)
                lineTo(93.79f, 54.69f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -6.69f)
                lineTo(224f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 64f)
                close()
            }
        }.build()

        return _SubtitlesSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _SubtitlesSlashFill: ImageVector? = null
