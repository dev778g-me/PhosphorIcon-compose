package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BalloonFill: ImageVector
    get() {
        if (_BalloonFill != null) {
            return _BalloonFill!!
        }
        _BalloonFill = ImageVector.Builder(
            name = "Filled.BalloonFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 16f)
                arcToRelative(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -88f, 88f)
                curveToRelative(0f, 23.43f, 9.4f, 49.42f, 25.13f, 69.5f)
                curveToRelative(12.08f, 15.41f, 26.5f, 26f, 41.91f, 31.09f)
                lineTo(96.65f, 228.85f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 104f, 240f)
                horizontalLineToRelative(48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.35f, -11.15f)
                lineTo(149f, 204.59f)
                curveToRelative(15.4f, -5.07f, 29.83f, -15.68f, 41.91f, -31.09f)
                curveTo(206.6f, 153.42f, 216f, 127.43f, 216f, 104f)
                arcTo(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 16f)
                close()
                moveTo(177.32f, 103.89f)
                arcTo(8.52f, 8.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.88f, -6.68f)
                arcToRelative(41.29f, 41.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, -33.43f, -33.43f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.64f, -15.78f)
                arcToRelative(57.5f, 57.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 46.57f, 46.57f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 177.32f, 103.89f)
                close()
            }
        }.build()

        return _BalloonFill!!
    }

@Suppress("ObjectPropertyName")
private var _BalloonFill: ImageVector? = null
