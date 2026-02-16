package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FileCloudFill: ImageVector
    get() {
        if (_FileCloudFill != null) {
            return _FileCloudFill!!
        }
        _FileCloudFill = ImageVector.Builder(
            name = "Filled.FileCloudFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(160f, 181f)
                arcToRelative(52.06f, 52.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -52f, 51f)
                lineTo(60.72f, 232f)
                curveTo(40.87f, 232f, 24f, 215.77f, 24f, 195.92f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.28f, -31.79f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.77f, 4.33f)
                arcToRelative(63.53f, 63.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 11.15f)
                arcTo(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 55.55f, 188f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 180f)
                arcToRelative(47.55f, 47.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.37f, -20f)
                horizontalLineToRelative(0f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 181f)
                close()
                moveTo(216f, 88f)
                lineTo(216f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(176f, 232f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(24f)
                lineTo(200f, 96f)
                lineTo(152f, 96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                lineTo(144f, 40f)
                lineTo(56f, 40f)
                verticalLineToRelative(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                lineTo(40f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 24f)
                horizontalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 2.34f)
                lineToRelative(56f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 88f)
                close()
                moveTo(188.69f, 80f)
                lineTo(160f, 51.31f)
                lineTo(160f, 80f)
                close()
            }
        }.build()

        return _FileCloudFill!!
    }

@Suppress("ObjectPropertyName")
private var _FileCloudFill: ImageVector? = null
