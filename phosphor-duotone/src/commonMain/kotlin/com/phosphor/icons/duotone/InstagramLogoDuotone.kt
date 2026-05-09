package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.InstagramLogoDuotone: ImageVector
    get() {
        if (_InstagramLogoDuotone != null) {
            return _InstagramLogoDuotone!!
        }
        _InstagramLogoDuotone = ImageVector.Builder(
            name = "Duotone.InstagramLogoDuotone",
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
                moveTo(176f, 32f)
                horizontalLineTo(80f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 80f)
                verticalLineToRelative(96f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 48f)
                horizontalLineToRelative(96f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, -48f)
                verticalLineTo(80f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 32f)
                close()
                moveTo(128f, 168f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, -40f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 168f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 32f)
                lineTo(176f, 32f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 80f)
                lineTo(224f, 176f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 224f)
                lineTo(80f, 224f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 176f)
                lineTo(32f, 80f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 32f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f
            ) {
                moveTo(128f, 128f)
                moveToRelative(-40f, 0f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 0f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -80f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(180f, 76f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
        }.build()

        return _InstagramLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _InstagramLogoDuotone: ImageVector? = null
