package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.MountainsFill: ImageVector
    get() {
        if (_MountainsFill != null) {
            return _MountainsFill!!
        }
        _MountainsFill = ImageVector.Builder(
            name = "Filled.MountainsFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(254.88f, 195.92f)
                lineToRelative(-54.56f, -92.08f)
                arcTo(15.87f, 15.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 186.55f, 96f)
                horizontalLineToRelative(0f)
                arcToRelative(15.85f, 15.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.76f, 7.84f)
                lineToRelative(-15.64f, 26.39f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.07f)
                lineToRelative(26.8f, 45.47f)
                arcToRelative(8.13f, 8.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.89f, 10.55f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.8f, -2.26f)
                lineTo(101.79f, 71.88f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -27.58f, 0f)
                lineTo(1.11f, 195.94f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 9.52f)
                arcTo(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.23f, 208f)
                horizontalLineTo(247.77f)
                arcToRelative(8.29f, 8.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.09f, -2.55f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 254.88f, 195.92f)
                close()
                moveTo(64.43f, 120f)
                lineTo(88f, 80f)
                lineToRelative(23.57f, 40f)
                close()
                moveTo(140f, 52f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 24f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 140f, 52f)
                close()
            }
        }.build()

        return _MountainsFill!!
    }

@Suppress("ObjectPropertyName")
private var _MountainsFill: ImageVector? = null
