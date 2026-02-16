package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.BowlFoodFill: ImageVector
    get() {
        if (_BowlFoodFill != null) {
            return _BowlFoodFill!!
        }
        _BowlFoodFill = ImageVector.Builder(
            name = "Filled.BowlFoodFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 104f)
                horizontalLineToRelative(-8.37f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -175.26f, 0f)
                horizontalLineTo(32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                arcToRelative(104.35f, 104.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 92.28f)
                verticalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineToRelative(-3.72f)
                arcTo(104.35f, 104.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 112f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 104f)
                close()
                moveTo(173.48f, 56.23f)
                quadToRelative(2.75f, 2.25f, 5.27f, 4.75f)
                arcToRelative(87.92f, 87.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -49.15f, 43f)
                horizontalLineTo(100.1f)
                arcTo(72.26f, 72.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 56f)
                curveTo(169.83f, 56f, 171.66f, 56.09f, 173.48f, 56.23f)
                close()
                moveTo(148.12f, 104f)
                arcToRelative(71.84f, 71.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 41.27f, -29.57f)
                arcTo(71.45f, 71.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 199.54f, 104f)
                close()
                moveTo(128f, 40f)
                arcToRelative(71.87f, 71.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 2.57f)
                arcTo(88.36f, 88.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 83.33f, 104f)
                horizontalLineTo(56.46f)
                arcTo(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 40f)
                close()
            }
        }.build()

        return _BowlFoodFill!!
    }

@Suppress("ObjectPropertyName")
private var _BowlFoodFill: ImageVector? = null
