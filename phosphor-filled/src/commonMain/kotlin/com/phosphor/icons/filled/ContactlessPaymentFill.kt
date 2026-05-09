package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ContactlessPaymentFill: ImageVector
    get() {
        if (_ContactlessPaymentFill != null) {
            return _ContactlessPaymentFill!!
        }
        _ContactlessPaymentFill = ImageVector.Builder(
            name = "Filled.ContactlessPaymentFill",
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
                moveTo(97.07f, 155.74f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -14.14f, -7.48f)
                arcToRelative(42.79f, 42.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -40.52f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.14f, -7.48f)
                arcTo(59.33f, 59.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 97.07f, 155.74f)
                close()
                moveTo(125.07f, 171.74f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -14.12f, -7.52f)
                arcToRelative(77.07f, 77.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -72.48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.12f, -7.52f)
                arcTo(93f, 93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 125.06f, 171.76f)
                close()
                moveTo(153.07f, 187.74f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 139f, 180.23f)
                arcToRelative(110.62f, 110.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -104.46f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.12f, -7.54f)
                arcTo(126.67f, 126.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 153.07f, 187.77f)
                close()
            }
        }.build()

        return _ContactlessPaymentFill!!
    }

@Suppress("ObjectPropertyName")
private var _ContactlessPaymentFill: ImageVector? = null
