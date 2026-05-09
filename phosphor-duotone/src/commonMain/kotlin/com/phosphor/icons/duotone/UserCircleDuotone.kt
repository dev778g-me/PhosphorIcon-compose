package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.UserCircleDuotone: ImageVector
    get() {
        if (_UserCircleDuotone != null) {
            return _UserCircleDuotone!!
        }
        _UserCircleDuotone = ImageVector.Builder(
            name = "Duotone.UserCircleDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(128f, 32f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 63.8f, 199.38f)
                horizontalLineToRelative(0f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 160f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, -40f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40f, 40f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64.2f, 39.37f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 32f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(63.8f, 199.37f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128.4f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 120f)
                moveToRelative(-40f, 0f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 0f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -80f, 0f)
            }
        }.build()

        return _UserCircleDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _UserCircleDuotone: ImageVector? = null
