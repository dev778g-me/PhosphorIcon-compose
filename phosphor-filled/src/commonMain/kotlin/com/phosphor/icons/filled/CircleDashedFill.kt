package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CircleDashedFill: ImageVector
    get() {
        if (_CircleDashedFill != null) {
            return _CircleDashedFill!!
        }
        _CircleDashedFill = ImageVector.Builder(
            name = "Filled.CircleDashedFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(182.59f, 69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.29f, 0.7f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.6f, 30.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.18f, 5.08f)
                arcToRelative(71.87f, 71.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.4f, -25f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 182.59f, 69f)
                close()
                moveTo(73.41f, 187.05f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.29f, -0.7f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -17.6f, -30.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 59.7f, 150.8f)
                arcToRelative(71.87f, 71.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.4f, 24.95f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 73.41f, 187.05f)
                close()
                moveTo(74.1f, 80.25f)
                arcToRelative(71.87f, 71.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.4f, 25f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -15.18f, -5.08f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.6f, -30.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 10.6f)
                close()
                moveTo(145.59f, 214.25f)
                arcToRelative(87.8f, 87.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -35.18f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.18f, -15.68f)
                arcToRelative(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28.82f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.18f, 15.68f)
                close()
                moveTo(151.84f, 51.25f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 57.61f)
                arcToRelative(7.89f, 7.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.6f, -0.16f)
                arcToRelative(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -28.82f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3.18f, -15.68f)
                arcToRelative(87.92f, 87.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 35.18f, 0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 151.84f, 51.2f)
                close()
                moveTo(211.48f, 155.93f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -17.6f, 30.47f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -10.6f)
                arcToRelative(71.87f, 71.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.4f, -24.95f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.18f, 5.08f)
                close()
            }
        }.build()

        return _CircleDashedFill!!
    }

@Suppress("ObjectPropertyName")
private var _CircleDashedFill: ImageVector? = null
