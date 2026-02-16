package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.GoogleDriveLogoFill: ImageVector
    get() {
        if (_GoogleDriveLogoFill != null) {
            return _GoogleDriveLogoFill!!
        }
        _GoogleDriveLogoFill = ImageVector.Builder(
            name = "Filled.GoogleDriveLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(237.6f, 143.78f)
                lineTo(169.13f, 31.52f)
                arcTo(15.91f, 15.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 155.56f, 24f)
                lineTo(100.43f, 24f)
                arcToRelative(15.89f, 15.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.56f, 7.52f)
                lineToRelative(-0.05f, 0.07f)
                lineTo(18.44f, 143.7f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.33f, 16.42f)
                lineToRelative(27.32f, 47.82f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 59.32f, 216f)
                lineTo(196.67f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.89f, -8.06f)
                lineToRelative(27.32f, -47.82f)
                arcTo(15.91f, 15.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 237.6f, 143.78f)
                close()
                moveTo(219f, 144f)
                lineTo(172.52f, 144f)
                lineTo(137.33f, 85.33f)
                lineToRelative(22.75f, -37.92f)
                close()
                moveTo(92.53f, 160f)
                horizontalLineToRelative(70.94f)
                lineToRelative(24f, 40f)
                lineTo(68.53f, 200f)
                close()
                moveTo(102.13f, 144f)
                lineTo(128f, 100.88f)
                lineTo(153.87f, 144f)
                close()
                moveTo(95.91f, 47.41f)
                lineToRelative(22.76f, 37.92f)
                lineTo(83.47f, 144f)
                lineTo(37f, 144f)
                close()
            }
        }.build()

        return _GoogleDriveLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleDriveLogoFill: ImageVector? = null
