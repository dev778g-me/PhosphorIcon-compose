package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.PushPinSlashFill: ImageVector
    get() {
        if (_PushPinSlashFill != null) {
            return _PushPinSlashFill!!
        }
        _PushPinSlashFill = ImageVector.Builder(
            name = "Filled.PushPinSlashFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(235.33f, 104f)
                lineToRelative(-47.62f, 47.78f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.79f, -0.14f)
                lineTo(108f, 70.27f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.13f, -5.51f)
                lineTo(152f, 20.7f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.63f, 0f)
                lineToRelative(60.69f, 60.68f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 235.33f, 104f)
                close()
                moveTo(53.92f, 34.62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, 0.21f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.37f, 10.75f)
                lineTo(67.32f, 73.15f)
                curveTo(58.26f, 75.09f, 48.2f, 79.37f, 38f, 87.63f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.29f, 23.78f)
                lineTo(85f, 159.71f)
                lineTo(42.55f, 202.14f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.6f, 11.09f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.71f, 0.43f)
                lineTo(96.29f, 171f)
                lineToRelative(48.29f, 48.29f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 155.9f, 224f)
                curveToRelative(0.38f, 0f, 0.75f, 0f, 1.13f, 0f)
                arcToRelative(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.64f, -6.33f)
                arcToRelative(88.62f, 88.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.64f, -20.2f)
                lineToRelative(21.77f, 23.95f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.84f, -10.76f)
                close()
            }
        }.build()

        return _PushPinSlashFill!!
    }

@Suppress("ObjectPropertyName")
private var _PushPinSlashFill: ImageVector? = null
