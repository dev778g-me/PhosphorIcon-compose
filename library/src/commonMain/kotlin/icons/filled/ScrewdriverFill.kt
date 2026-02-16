package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.ScrewdriverFill: ImageVector
    get() {
        if (_ScrewdriverFill != null) {
            return _ScrewdriverFill!!
        }
        _ScrewdriverFill = ImageVector.Builder(
            name = "Filled.ScrewdriverFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(233.23f, 22.75f)
                arcToRelative(50.46f, 50.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -71.31f, 0f)
                lineTo(108.68f, 76f)
                arcTo(15.92f, 15.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 104f, 87.3f)
                verticalLineTo(104f)
                horizontalLineTo(87.17f)
                arcToRelative(16.14f, 16.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.66f, 3.24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.82f, 0.72f)
                lineToRelative(-8f, 8f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 22.63f)
                lineToRelative(18.7f, 18.71f)
                lineToRelative(-77f, 77.05f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 11.32f)
                lineToRelative(77f, -77.06f)
                lineToRelative(18.71f, 18.71f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.62f, 0f)
                lineToRelative(8f, -8f)
                arcToRelative(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.72f, -0.83f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.25f, -9.66f)
                verticalLineTo(152f)
                horizontalLineToRelative(16.69f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 180f, 147.3f)
                lineToRelative(53.23f, -53.23f)
                arcToRelative(50.43f, 50.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -71.32f)
                close()
                moveTo(205.66f, 61.64f)
                lineToRelative(-56f, 56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.31f)
                lineToRelative(56f, -56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                close()
            }
        }.build()

        return _ScrewdriverFill!!
    }

@Suppress("ObjectPropertyName")
private var _ScrewdriverFill: ImageVector? = null
