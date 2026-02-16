package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BabyFill: ImageVector
    get() {
        if (_BabyFill != null) {
            return _BabyFill!!
        }
        _BabyFill = ImageVector.Builder(
            name = "Filled.BabyFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(134.16f, 24.1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.56f, 1.81f)
                curveTo(120.3f, 41.48f, 120f, 55.79f, 120f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.68f, 7.79f)
                arcTo(8.24f, 8.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 136f, 55.68f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144.8f, 48f)
                arcToRelative(8.14f, 8.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.2f, 8.23f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, -0.27f)
                curveToRelative(0f, -0.63f, 0.09f, -10.78f, 5.44f, -24f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.59f, -5.39f)
                arcTo(104.16f, 104.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24.07f, 131.66f)
                curveTo(26f, 186.72f, 71.23f, 231f, 126.32f, 231.9f)
                arcToRelative(104f, 104f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.84f, -207.8f)
                close()
                moveTo(80f, 127.91f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 127.91f)
                close()
                moveTo(160.27f, 182.68f)
                arcToRelative(61f, 61f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64.54f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.54f, -13.54f)
                arcToRelative(45f, 45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 47.46f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.54f, 13.54f)
                close()
                moveTo(164f, 139.91f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 164f, 139.91f)
                close()
            }
        }.build()

        return _BabyFill!!
    }

@Suppress("ObjectPropertyName")
private var _BabyFill: ImageVector? = null
