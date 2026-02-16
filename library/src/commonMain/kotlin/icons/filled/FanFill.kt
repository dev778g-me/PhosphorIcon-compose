package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.FanFill: ImageVector
    get() {
        if (_FanFill != null) {
            return _FanFill!!
        }
        _FanFill = ImageVector.Builder(
            name = "Filled.FanFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(233f, 135f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = false, -89.62f, -35.45f)
                lineToRelative(16.39f, -65.44f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.45f, -8.68f)
                arcTo(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = false, 95.69f, 128.91f)
                lineTo(30.82f, 147.44f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.8f, 7.32f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = false, 44.42f, 60.66f)
                arcToRelative(60.52f, 60.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.62f, 2.07f)
                arcToRelative(60.07f, 60.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 59.88f, -62f)
                lineToRelative(48.48f, 46.92f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.25f, 1.35f)
                arcTo(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = false, 233f, 135f)
                close()
                moveTo(130.44f, 147.85f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17.41f, -22.29f)
                arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 130.44f, 147.85f)
                close()
            }
        }.build()

        return _FanFill!!
    }

@Suppress("ObjectPropertyName")
private var _FanFill: ImageVector? = null
